public class DigitalClock {

    int secondsValue; // 0 or 1
    int h0[] = new int[4]; // 0 or 1
    int h1[] = new int[4];

    int m0[] = new int[11];
    int m1[] = new int[4];

    public void setHours(int newValue) {
        for (int i = 0; i < h0.length; i++) {
            h0[i] = (i + 1) * 5 <= newValue ? 1 : 0;
        }
        newValue = newValue % 5;
        for (int i = 0; i < h0.length; i++) {
            h1[i] = (i + 1) <= newValue ? 1 : 0;
        }
    }

    public void setMinutes(int newValue) {
        for (int i = 0; i < m0.length; i++) {
            m0[i] = (i + 1) * 5 <= newValue ? 1 : 0;
        }
        for (int i = 0; i < m1.length; i++) {
            m1[i] = (i + 1) <= newValue ? 1 : 0;
        }
    }

    public void setSeconds(int newValue) {
        for (int i = 0; i <= 60; i++)
            if ((i % 2) == 0){
                secondsValue = (newValue % 2) == 0 ? 0 : 1; // even number -> 1,  odd number -> 0
        }
    }

    public void setTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void printCurrentTime() {
        System.out.println();
        System.out.println("\n" + "Seconds: " + secondsValue);
        System.out.println("Hours(h0/h1): ");
        for (int i = 0; i < 8; i++) {
            int value = 0;
            if (i < h0.length) {
                value = h0[i];
            } else {
                if (i - h0.length == 0) {
                    System.out.print(" / ");
                }
                value = h1[i - h0.length];
            }

            System.out.print(value);
        }
        System.out.println();
        printArray(m0, "/");
        System.out.println();
        System.out.print(secondsValue);
    }

    private void printArray(int[] array, String separator) {
        for (int value : array) {
            System.out.print(value);
        }
    }
}

