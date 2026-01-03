public class nestedif {
    public static void main(String args[]){
        char ch='A';

        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
            if(ch=='A' || ch=='a'){
                System.out.println(ch + " is a vowel.");
            } else {
                if(ch=='E' || ch=='e'){
                    System.out.println(ch + " is a vowel.");
                } else {
                    if(ch=='I' || ch=='i'){
                        System.out.println(ch + " is a vowel.");
                    } else {
                        if(ch=='O' || ch=='o'){
                            System.out.println(ch + " is a vowel.");
                        } else {
                            System.out.println(ch + " is a vowel.");
                        }
                    }
                }
            }
        } else {
            System.out.println(ch + " is not a vowel.");
        }
    }
}
