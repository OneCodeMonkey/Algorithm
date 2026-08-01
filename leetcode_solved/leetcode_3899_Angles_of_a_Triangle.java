// Runtime 3 ms Beats 98.92% 
// Memory 49.13 MB Beats 90.82%
// 余弦定理计算角度
// T:O(1), S:O(1)
// 
class Solution {
    public double[] internalAngles(int[] sides) {
        Arrays.sort(sides);
        int a = sides[0], b = sides[1], c = sides[2];
        if (a + b <= c || a + c <= b || b + c <= a) {
            return new double[]{};
        }

        double[] ret = new double[3];
        double angle1 = calculateAngleByCosineLaw(c, b, a), angle2 = calculateAngleByCosineLaw(b, a, c),
                angle3 = calculateAngleByCosineLaw(a, c, b);
        ret[0] = angle3;
        ret[1] = angle2;
        ret[2] = angle1;

        return ret;
    }

    private static double calculateAngleByCosineLaw(double oppositeSide,
                                                    double side1,
                                                    double side2) {
        // 计算cos值
        double cosValue = (side1 * side1 + side2 * side2 - oppositeSide * oppositeSide)
                / (2 * side1 * side2);

        // 处理浮点误差，确保cos值在[-1,1]范围内
        if (cosValue > 1.0) {
            cosValue = 1.0;
        } else if (cosValue < -1.0) {
            cosValue = -1.0;
        }

        // 计算角度（弧度）
        double angleRad = Math.acos(cosValue);

        // 转换为角度
        double angleDeg = Math.toDegrees(angleRad);

        return angleDeg;
    }
}

