class median{
 public static void main(String[] args) {
    int num1 []={1, 2, 3};
    int num2 []={4, 5, 6};
    int num[] = new int[num1.length+num2.length];
    // System.out.println(num.length);
    for(int i=0;i<num1.length;i++){
        num [i]=num1[i];
      
        // System.out.println(num[i]);
    }
    for(int i=0;i<=num2.length-1;i++){
        num[num1.length+i]=num2[i];
        // System.out.println(num[i]);
    }
    for(int i=0;i<num.length;i++){
        System.out.println(num[i]);
    }
    if(num.length%2!=0){
        System.out.println("the median is "+ num[(num.length-1)/2]);
    }else{
      float no1=num[num.length/2];
      float no2 = num[(num.length/2)-1];
      System.out.println("The median is "+(no1+no2)/2);
    }
}
}
