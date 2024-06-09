public class Jun5 {
    public static void main(String[] args) {
       /* String[] words = {"apple", "banana", "cherry", "durian"};
        *//*for(String q : words){
            for(String w : words){
                if(q.equals(w)){
                    continue;
                }else {
                    System.out.println(q +" " + w);
                }
            } *//*
        //foreach 강사님 해설 근데 이건 조금 불편하죠? 그냥 for문으로 쓰십시오 ㅋㅋ
        int index = 0;
        for (String word : words){
            for (int u = index+1; u<words.length;u++){
                String word2 = words[u];
                System.out.println(word + " "+ word2);
            }
            index++;
        }



        //이렇게도 쓸수있고
       *//* for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length; j++){
                if (words[i] == words[j]) continue;
                System.out.println(words[i] + " " + words[j]);
                }
            }
        }
        *//*
      *//*  for(int e = 0; e < words.length; e ++){
            for (int r = 1; r < words.length; r++) {
                if (words[e] == words[r]) {
                    continue;
                }

            } System.out.println(words[e] + " " + words[r]);
        }*//*

        //강사님 해설
        for (int r = 0; r < words.length-1; r ++){
            for(int t = r+1; t < words.length; t++){
                System.out.println(words[r]+" "+ words[t]);
            } //if문이 필요가 없다. 부모가 durian까지 갈 필요가 없으므로, length-1을 함
            //자식은 1번 인덱스부터 시작하면 되므로 굳이 if가 필요없다!!!!!!!! 신기하다
        }*/





    }
}

