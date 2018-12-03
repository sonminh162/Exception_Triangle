import java.util.Scanner;

public class TriangleException {
    public static void checkTriangle(int a,int b,int c)throws IllegalTriangleException{
        if(a>=0&&b>0&&c>0) {
            if (a + b <= c && a + c <= b && b + c <= a) {
                throw new IllegalTriangleException("Error: tong 2 canh bat ki phai lon hon canh con lai.");
            }else{
                System.out.println("Nhap dung.");
            }
        }else{
            System.out.println("Canh cua tam giac phai lon hon 0.");
        }
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TriangleException triangleExample = new TriangleException();
        try{
            System.out.println("Nhap 3 canh cua tam giac");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            checkTriangle(a,b,c);
        }catch(IllegalTriangleException e){
            System.out.println(e.errorMessage);
        }
    }
}
