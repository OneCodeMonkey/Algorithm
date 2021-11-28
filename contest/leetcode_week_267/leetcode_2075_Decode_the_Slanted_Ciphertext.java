class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int size = encodedText.length(), cols = size / rows, posX = 0, posY = 0, pos = 0;
        if (rows == 1 || size <= 1) {
            return encodedText;
        }
        StringBuilder ret = new StringBuilder();
        while (posY < cols) {
            int index = posX * cols + posY;
            ret.append(encodedText.charAt(index));
            posX++;
            posY++;
            if (posX >= rows) {
                posX = 0;
                posY = posY - rows + 1;
            }
            pos++;
        }
        return ret.toString().replaceAll("\\s+$","");
    }
}