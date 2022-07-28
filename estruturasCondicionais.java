public static void main(String[] args){
  // impostos = 9,70%  37,35%  49,50%
  double salarioAnual = 30000;
  double imposto1 = salarioAnual* 0.097;
  double imposto2 = salarioAnual* 0.3735;
  double imposto3 = salarioAnual* 0.4950;

  if (salarioAnual<= 34712) {
    System.out.println("O valor do imposto a pagar é de 9,70%");
    System.out.println("Isso equivale a " +imposto1+ " do seu salário anual");
  }else if (salarioAnual>= 34713 && salarioAnual<= 68507) {
    System.out.println("O valor do imposto a pagar é de 37,35%");
    System.out.println("Isso equivale a " +imposto2+ " do seu salário anual");
  } else{
    System.out.println("O valor do imposto a pagar é de 49,50%");
    System.out.println("Isso equivale a " +imposto3+ " do seu salário anual");
  }
}