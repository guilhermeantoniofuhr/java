public class notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        int nota1 = teclado.nextInt();

        System.out.println("Digite a nota 2");
        int nota2 = teclado.nextInt();

        int media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media > 3) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}