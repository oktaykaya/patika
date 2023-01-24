    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;

    public class MineSweeper {
        Scanner scanner = new Scanner(System.in);
    private int colNumber;
    private int lineNumber;
    private int wantLineNumber;
    private int wantColNumber;
        public int getWantLineNumber() {
            return wantLineNumber;
        }
        public void setWantLineNumber(int wantLineNumber) {
            this.wantLineNumber = wantLineNumber;
        }
        public int getWantColNumber() {
            return wantColNumber;
        }
        public void setWantColNumber(int wantColNumber) {
            this.wantColNumber = wantColNumber;
        }
        public MineSweeper(int colNumber, int lineNumber, int wantLineNumber, int wantColNumber) {
        this.colNumber = colNumber;
        this.lineNumber = lineNumber;
        this.wantLineNumber = wantLineNumber;
        this.wantColNumber = wantLineNumber;
    }
    public int getColNumber() {
        return colNumber;
    }

    public void setColNumber(int colNumber) {
        this.colNumber = colNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    //kullanıcıdan alınan bilgiler ile bir oyun tahtası yaratıyoruz
    public String[][] Board(){
        String[][] board = new String[getLineNumber()][getColNumber()];
        for (int i = 0; i<getLineNumber();i++){
            for (int j = 0; j<getColNumber();j++){
                board[i][j] = "- ";
            }
        }
        return board;
    }
    //Board metodunda yarattığımız tahtamızı bastırmaya yarayan metodumuz
    public String[][] PrintBoard(){
        System.out.println("Oyun Tahtası");
        String[][] board = Board().clone();
        for (int i = 0; i< getLineNumber();i++){
            for (int j = 0; j<getColNumber();j++){
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }
        return board;
    }
        public void PrintBoard(String[][] x){
            System.out.println("Oyun Tahtası");
            String[][] board = x.clone();
            for (int i = 0; i< getLineNumber();i++){
                for (int j = 0; j<getColNumber();j++){
                    System.out.print(board[i][j]);
                }
                System.out.println(" ");
            }
        }
    public void PrintMineBoard(String[][] x){
            System.out.println("Mayınlı Harita");
            String[][] board =MineBoard(x).clone(); //mayınlı haritamızı kopyalıyoruz
        // mayınlı haritamızı yazdırıyoruz
            for (int i = 0; i< getLineNumber();i++){
                for (int j = 0; j<getColNumber();j++){
                    System.out.print(board[i][j]);
                }
                System.out.println(" ");
            }
        }

    //mayınlı haritamıza mayın yerleştirmemizi sağlayan metodumuz
    public boolean RandoomBoolean(){
        double number = Math.random();
        return !(number < 0.8);
    }

    //Board metodundan aldığımız tahtamıza mayın yerleştiriyoruz
        public int mineCount(){
            int numberOfMine = getColNumber() * getLineNumber() / 4;
            return numberOfMine;
        }
    public String[][] MineBoard(String[][] x) {
        String[][] mineBoard = x.clone();
        //tahtamıza kaç adet mayın koymamız gerektiğini gösteren değerimiz

        int numberOfMine = mineCount();
        //for döngüleri tamamlandığında tahtaya hala koymamız gereken mayın olması durumu için önlem olarak koyulmuş bir while döngüsü
        while (numberOfMine !=0) {

            for (int i = 0; i < getLineNumber(); i++) {
                for (int j = 0; j < getColNumber(); j++) {

                    boolean value = RandoomBoolean();

                    if (value) {
                        mineBoard[i][j] = "* ";
                        numberOfMine--;
                        //yeterli mayın sayısına ulaştığımızda döngümüz son bulacak ve oyun tahtamız hazır olacak
                        if (numberOfMine == 0)
                            break;
                    }
                }
                //ilk for döngüsü için yeterli mayın sayısına ulaştığımızda döngümüz son bulacak ve oyun tahtamız hazır olacak
                if (numberOfMine == 0)
                    break;
            }
        }
        return mineBoard;
    }
    public void Destination(){
        System.out.print("satır: ");
        int a = scanner.nextInt();
        System.out.print("sütun : ");;
        int b = scanner.nextInt();
        if (a > getLineNumber() || b > getColNumber() || a < 0 || b < 0){
            System.out.println("yanlış değerler girdiniz lütfen tekrar deneyiniz");
            Destination();
        }
        else {
            setWantLineNumber(a);
            setWantColNumber(b);
        }
    }

    public int isWin(String[][] array){
            //Mayınsız tablomuzu gönderiyoruz
            String[][] arr = array.clone();
            int count = 0;
            for (int i = 0; i<getLineNumber(); i++){
                for (int j = 0; j<getColNumber(); j++){

                    //tabloda açılmamış noktamız varsa countumuzu artırıyoruz 3 e 3 lük bir tabloda ilk başta countumuz 8i sayacak çünkü bir tanesini çoktan açmış olacağız
                    if (arr[i][j] == "- "){
                        count++;
                    }
                }
            }
            //eğer countumuz burada mayın sayımızı tutarsa oyunu kazanmışız demektir çünkü açılmamış tek "-" işaretleri mayınlı olanlar olacaktır
            if (count == mineCount()){
                System.out.println("Tebrikler Oyunu Kazandınız...");
                return 0;
            }
            return 1;
    }
    public void Game(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen oyun tahtanızın boyutlarını belirleyiniz\n" +
                "satır sayısı : ");
        setLineNumber(scanner.nextInt());
        System.out.print("sütun sayısı : ");
        setColNumber(scanner.nextInt());

        String[][] board = Board().clone();
        PrintMineBoard(board);
        String[][] board2 = PrintBoard();

        int sayi = 0;
        for (int i = 0; i<getLineNumber();i++){
            for (int j = 0; j<getColNumber();j++){
                if (board[i][j] == "- ")
                    sayi++;
            }
        }
        int x = 1;
        while(x == 1)  {
            int count = 0;
            Destination();
            if (board[getWantLineNumber()][getWantColNumber()] == "* "){
                System.out.println("GAMEOVER");
                break;
            }
            else{
                for (int i = 1 ; i>-2 ; i--){
                    for (int j = 1 ; j>-2 ; j--){
                        if (getWantLineNumber()+i < 0 || getWantColNumber() +j <0){
                            continue;
                        }
                        if (getWantLineNumber() + i >= getLineNumber() || getWantColNumber() + j >= getColNumber()){
                            continue;
                        }
                        else if (board[getWantLineNumber()+i][getWantColNumber()+j] == "* ") {
                            count++;
                        }
                    }
                }
                String s = String.valueOf(count);
                board2[getWantLineNumber()][getWantColNumber()] = s+" ";
                PrintBoard(board2);
                x = isWin(board2);
                }
            }
        }
    }

