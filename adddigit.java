public class adddigit {

    public int adddigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        adddigit ad = new adddigit();
        System.out.println(ad.adddigits(38)); // 2
        System.out.println(ad.adddigits(0));  // 0
        System.out.println(ad.adddigits(9));  // 9
    }
}
