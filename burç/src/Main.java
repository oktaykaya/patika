import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month,day;

        System.out.print("lütfen kaçıncı ayda doğdunuzu sayı ile yazınız : ");
        month = scanner.nextInt();

        System.out.print("lütfen kaçıncı günde doğdunuzu yazınız : ");
        day = scanner.nextInt();
        if (month >= 1 && month <= 12) {

                if (day >= 1 && day <= 31) {
                    if (month == 1) {
                        if (day < 22) {
                            System.out.println("OĞLAK");
                     } else {
                            System.out.println("KOVA");
                     }
                    }
                }
                else {
                    System.out.println("geçersiz bir gün girdiniz");
                }
             if (day >= 1 && day <= 28) {
                if (month == 2) {
                    if (day < 20) {
                        System.out.println("KOVA");
                    } else {
                        System.out.println("balık");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 31) {
                if (month == 3) {
                    if (day < 22) {
                        System.out.println("balık");
                    } else {
                        System.out.println("koç");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }


            if (day >= 1 && day <= 30) {
                if (month == 4) {
                    if (day < 21) {
                        System.out.println("koç");
                    } else {
                        System.out.println("boğa");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 31) {
                if (month == 5) {
                    if (day < 22) {
                        System.out.println("boğa");
                    } else {
                        System.out.println("ikizler");
                    }
                }

            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 30) {
                if (month == 6) {
                    if (day < 23) {
                        System.out.println("ikizler");
                    } else {
                        System.out.println("yengeç");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 31) {
                if (month == 7) {
                    if (day < 23) {
                        System.out.println("yengeç");
                    } else {
                        System.out.println("aslan");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 31) {
                if (month == 8) {
                    if (day < 23) {
                        System.out.println("aslan");
                    } else {
                        System.out.println("başak");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 30) {
                if (month == 9) {
                    if (day < 23) {
                        System.out.println("başak");
                    } else {
                        System.out.println("terazi");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 31) {
                if (month == 10) {
                    if (day < 23) {
                        System.out.println("terazi");
                    } else {
                        System.out.println("akrep");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 30) {
                if (month == 11) {
                    if (day < 22) {
                        System.out.println("akrep");
                    } else {
                        System.out.println("yay");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }

            if (day >= 1 && day <= 31) {
                if (month == 12) {
                    if (day < 22) {
                        System.out.println("yay");
                    } else {
                        System.out.println("oğlak");
                    }
                }
            }
            else {
                System.out.println("geçersiz bir gün girdiniz");
            }






        }



        else {
            System.out.println("geçersiz bir ay girdiniz");
        }

    }
}
