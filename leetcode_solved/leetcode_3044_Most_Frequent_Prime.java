// Runtime 21 ms Beats 44.41% of users with Java
// Memory 44.90 MB Beats 39.24% of users with Java
// Plain search.
// T:O(m * n * (m + n) * Math.max(m, n)), S:O((m + n) ^ 2)
// 
class Solution {
    HashSet<Integer> primes = new HashSet<>(), notPrimes = new HashSet<>();
    HashMap<Integer, Integer> primeCount = new HashMap<>();

    public int mostFrequentPrime(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int direction = 0; direction < 8; direction++) {
                    StringBuilder ret = new StringBuilder();
                    ret.append(mat[i][j]);
                    int posX = i, posY = j, stepX = 0, stepY = 0;
                    switch (direction) {
                        case 0:
                            // up
                            stepX = -1;
                            break;
                        case 1:
                            // north-ease
                            stepX = -1;
                            stepY = 1;
                            break;
                        case 2:
                            // east
                            stepY = 1;
                            break;
                        case 3:
                            // south-east
                            stepX = 1;
                            stepY = 1;
                            break;
                        case 4:
                            // south
                            stepX = 1;
                            break;
                        case 5:
                            // south-west
                            stepX = 1;
                            stepY = -1;
                            break;
                        case 6:
                            // west
                            stepY = -1;
                            break;
                        case 7:
                            // north-west
                            stepX = -1;
                            stepY = -1;
                            break;
                        default:
                    }
                    while (posX + stepX < row && posX + stepX >= 0 && posY + stepY < col && posY + stepY >= 0) {
                        posX += stepX;
                        posY += stepY;
                        ret.append(mat[posX][posY]);

                        int number = Integer.parseInt(ret.toString());
                        if (isPrime(number)) {
                            primeCount.merge(number, 1, Integer::sum);
                        }
                    }
                }
            }
        }

        if (primeCount.isEmpty()) {
            return -1;
        }
        int[][] sortArr = new int[primeCount.size()][2];
        int pos = 0;
        for (int number : primeCount.keySet()) {
            sortArr[pos++] = new int[]{number, primeCount.get(number)};
        }
        Arrays.sort(sortArr, (a, b) -> a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]);

        return sortArr[0][0];
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3 || primes.contains(num)) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        if (notPrimes.contains(num)) {
            return false;
        }
        int sqrtRoot = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrtRoot; i++) {
            if (num % i == 0) {
                notPrimes.add(num);
                return false;
            }
        }
        primes.add(num);

        return true;
    }
}
