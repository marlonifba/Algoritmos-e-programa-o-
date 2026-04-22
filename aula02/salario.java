void main () {

Double salario = Double.parseDouble(IO.readln("Informe o salário: "));

if(salario <=1000)
   salario = salario * 1.15;

else
   if (salario<=2000)
    salario = salario * 1.125;

   else
    salario = salario * 1.1;

System.out.printf("O novo salário é %.2f \n" , salario);


}