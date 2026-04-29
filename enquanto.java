void main(){
    int numero= Integer.parseInt(IO.readln("informe um número: "));
    int multiplicador=1;

while(multiplicador<=10){
    Systema.out.printf("%d x %d = %d \n", numero, multiplicador, numero*multiplicador);
    multiplicador++;
}
}

// do while entra no laço e só sai quandor for falso

