package br.com.alura.mymusics.models;

public class MyFavorites {
    public void include(Audio audio){
        if (audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + ", é considerado sucesso absoluto!");
        } else{
            System.out.println(audio.getTitle() + ", boa opção para escutar mais tarde.");
        }
    }

}
