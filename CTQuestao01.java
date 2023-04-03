public class CTQuestao01 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(args[0]);
        if (idade < 0){
            System.out.println("Idade inválida!");
        }else if(idade < 16){
            System.out.println("Não pode votar.");
        } else if (idade < 18 || idade > 65) {
            System.out.println("Voto facultativo.");
        }else{
            System.out.println("Voto obrigatório.");
        }
    }
}
