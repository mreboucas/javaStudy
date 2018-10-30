package java_estudo.formatador_digito;

public class Exemplo {

    static class C {

        static int a;

        int b = 2; 
        
        int c = 1;
        
        Integer d;

        void metodo() {
        	System.out.println(b ^ c);
            System.out.println(String.format("%d %d" ,a, b));
            System.out.println(a + " " + b);
            System.out.printf("d%", a + " " + b);

        }

    }

    public static void main(String[] args) {

        C myC1 = new C();

        C myC2 = new C();

        myC1.a=10;

        myC2.b=20;

        myC1.metodo();

        myC2.metodo();

    }

} 


