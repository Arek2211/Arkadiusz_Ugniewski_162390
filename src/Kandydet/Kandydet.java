package Kandydet;


public class Kandydet implements Cloneable, Comparable<Kandydet> {
    private String nazwa;
    private int wiek;
    private String wyksztalcony;
    private int latadoswiadczenia;
    private Kandydet k;

    public Kandydet(String nazwa, int wiek, String wyksztalcony, int latadoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcony = wyksztalcony;
        this.latadoswiadczenia = latadoswiadczenia;
    }

    public String toString(){
        String rtn =" [" +  this.nazwa + ", " + this.wiek + ", " + this.wyksztalcony + ", " + this.latadoswiadczenia + "] ";
        return rtn;

    }


    public int compareTo(Kandydet o) {
        k = o;
        int compareValue = 0;

        if(this.wyksztalcony.compareTo(o.wyksztalcony) == 0){
            if(Integer.compare(this.wiek,o.wiek) == 0){
                compareValue = 0;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
            if(Integer.compare(this.wiek,o.wiek) > 0){
                compareValue +=100;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
            if(Integer.compare(this.wiek,o.wiek) < 0){
                compareValue -=100;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
        }
        if(this.wyksztalcony.compareTo(o.wyksztalcony) > 0){
            compareValue += 100;
            if(Integer.compare(this.wiek,o.wiek) == 0){
                compareValue = 0;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
            if(Integer.compare(this.wiek,o.wiek) > 0){
                compareValue +=100;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
            if(Integer.compare(this.wiek,o.wiek) < 0){
                compareValue -=100;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
        }
        if(this.wyksztalcony.compareTo(o.wyksztalcony) < 0){
            compareValue -=100;
            if(Integer.compare(this.wiek,o.wiek) == 0){
                compareValue = 0;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
            if(Integer.compare(this.wiek,o.wiek) > 0){
                compareValue +=100;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
            if(Integer.compare(this.wiek,o.wiek) < 0){
                compareValue -=100;
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) == 0){
                    compareValue = 0;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) > 0){
                    compareValue +=100;
                }
                if(Integer.compare(this.latadoswiadczenia,o.latadoswiadczenia) < 0){
                    compareValue -=100;
                }
            }
        }
        return compareValue;
    }


    public boolean Qualified(){
        if(Rekrutacja.doswiadczenie<=this.latadoswiadczenia){
            return true;
        }
        return false;
    }
}
