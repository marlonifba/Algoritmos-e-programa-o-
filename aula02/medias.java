void main( ){
float nota1 = float.parseFloat(IO.readln("Informe a nota da 1a unidade:"));
float nota2 = Integer.parseFloat(IO.readln("Informe a nota da 2a unidade:"));
float nota3 = Integer.parseFloat(IO.readln("Informe a nota da 3a unidade:"));

float media = (nota1 + nota2 + nota3)/3;

if(media>=7)
IO.println("Aprovado com média: " + media + "Outro texto" + nota1);

else
System.out.printf("Reprovado com média: %5.2f \n", media);

}