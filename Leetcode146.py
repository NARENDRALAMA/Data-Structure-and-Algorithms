class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None
        self.prev = None


class LRUCache:

    def deleteNode(self, node):
        prev_node = node.prev
        after_node = node.next  # Correct reference

        prev_node.next = after_node
        after_node.prev = prev_node

        node.next = None
        node.prev = None

    def insert_after_head(self, node):
        current_after_head = self.head.next
        self.head.next = node
        node.next = current_after_head
        current_after_head.prev = node
        node.prev = self.head

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cache = {}
        self.head = Node(-1, -1)
        self.tail = Node(-1, -1)
        self.head.next = self.tail
        self.tail.prev = self.head

    def get(self, key: int) -> int:
        if self.cache.get(key) is None:
            return -1

        node = self.cache[key]
        self.deleteNode(node)  # Call deleteNode correctly
        self.insert_after_head(node)

        return node.value

    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            node = self.cache[key]
            node.value = value
            self.deleteNode(node)
            self.insert_after_head(node)
        else:
            if len(self.cache) >= self.capacity:
                node = self.tail.prev
                self.cache.pop(node.key)
                self.deleteNode(node)

            new_node = Node(key, value)
            self.cache[key] = new_node
            self.insert_after_head(new_node)