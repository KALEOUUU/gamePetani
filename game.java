package gameDrone;
    class game {
        public static void main(String[] args){

            // membuat objek player
            
            drone saya = new drone();
            // mengisi atribut player
            saya.energi = 90;
            saya.ketinggian = 78;
            saya.kecepatan = 100;
            saya.merek = "dji";

            // menjalankan method
            saya.terbang();
            saya.belok();
            saya.maju();
            saya.mundur();
            saya.turun();

            // menjalankan method
          

            if(saya.energi <= 0){
                System.out.println("Game Over!");

        }
    }
}