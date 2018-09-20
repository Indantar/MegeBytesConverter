public class megaBytesConverter {

    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mb,kb;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else if (kiloBytes==0){
            System.out.println("0 KB = 0 MB and 0 KB");
        }
        else{
            mb = kiloBytes / 1024;
            kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
