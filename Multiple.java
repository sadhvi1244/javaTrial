public class Multiple {
}
class parent1{  //by default extends object to issme object ki bhot property inbuil hai(jb hm koi class bnate hai aur extends keyword nhi use kerte to bts extends object hoti hai
    int age=18;
}
class parent2{
    int age=19;
}
class child extends parent1{   //parent2{ //not allowed! (yaha ambibity ambious ho jiaga)
                             //ak class ka only ak hi parent ho skte hai
}