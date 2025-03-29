class Main{
  public static void main(String[] args){
  
    int sum=0;
    int n=5;
   
    //for(int i=1; i<=5; i++){
    //for(int i=n; i>=1; i--){
    for(int i=1; i<=5; i + 2){
    //for(int i=0; i<=5; i + 2){
    sum+=i;
    }
    
    System.out.println("Sum = "+sum);
  }
}