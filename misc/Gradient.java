public class Gradient{

    public static void main(String[] args) {
        int gradientSteps = 10;

        for (int i = 0; i < gradientSteps; i++) {
            double ratio = (double) i / (gradientSteps - 1);
            String color = interpolateColor(255, 0, 0, 0, 0, 255, ratio);
            System.out.print("\033[1;38;2;" + color + "mGradient \033[0m");
			//System.out.print("\033[1;48;2;" + color + "m \033[0m");
        }
    }

    private static String interpolateColor(int startR, int startG, int startB, int endR, int endG, int endB, double ratio) {
        int r = (int) (startR + ratio * (endR - startR));
        int g = (int) (startG + ratio * (endG - startG));
        int b = (int) (startB + ratio * (endB - startB));

        return r+";"+g+";"+b;
    }
}
