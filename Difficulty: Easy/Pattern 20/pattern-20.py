class Solution:
    def printTriangle(self, n):
        # Upper part
        for i in range(1, n + 1):
            print('*' * i + ' ' * (2 * (n - i)) + '*' * i)

        # Lower part
        for i in range(n - 1, 0, -1):
            print('*' * i + ' ' * (2 * (n - i)) + '*' * i)
