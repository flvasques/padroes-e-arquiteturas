
package modelo;

public class Date {
    public final int day;
    public final int month;
    public final int year;
    
    public Date(){
        day = 1;
        month = 1;
        year = 1900;
    }
    
    public Date(int d, int m, int a ){
       int dia, mes, ano;
        
       if(m > 0 && m < 13){
           mes = m;
       }else throw new IllegalArgumentException ( "Mes Invalido." );
       
       if(d <= 31 && d > 0){
           dia = d;
           ano = a;
       } else if(d > 31 && d > 0){
           ano = d;
           dia = a;
       }else throw new IllegalArgumentException ( "Primeiro argumento invalido." );
       
       if(ano < 1900) throw new IllegalArgumentException ( "Ano invalido." );
       
       if(dia < 1 || dia  > 31 || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30))) throw new IllegalArgumentException ( "Dia Invalido." );
       
       if( (mes == 2 && !(ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0) && dia <= 29) && dia > 28 ) throw new IllegalArgumentException ( "Dia Invalido" );
       
       
        day = dia;
        month = mes;
        year = ano;
    }

    @Override
    public String toString() {
        return (day < 10 ? "0" + day : day )  + "/" + (month < 10 ? "0" + month : month) +"/" + year;
    }
    
    public boolean after(Date d){
        int dia = this.day + 1, mes = this.month, ano = this.year;
        if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia < 1){
            if(mes == 3 && (mes == 2 && (ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0))) dia = 29;
            else if(mes == 3) dia = 28;
            else dia = 30;
            mes--;
        }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 1){
            mes--;
            dia = 31;
        }else if((mes == 2 && (ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0) && dia > 29) || dia > 28){
            mes--;
            dia = 31;
        }
        if(mes < 1){
            mes = 31;
            ano--;
        }
        return (dia == d.day && mes == d.month && ano == d.year);
    }
    
    public boolean before(Date d){
        int dia = this.day - 1, mes = this.month, ano = this.year;
        if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia < 1){
            if((mes == 3 && (ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0))) dia = 29;
            else if(mes == 3) dia = 28;
            else dia = 30;
            mes--;
        }else if((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 1){
            mes--;
             dia = 31;
        }
        if(mes < 1){
            mes = 12;
            ano--;
        }
        return (dia == d.day && mes == d.month && ano == d.year);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Date){
            Date d = (Date) obj;
         return(this.day == d.day && this.month == d.month && this.year == d.year);
        }else{
            return false;
        }
    }

    public Date tomorrow() {
      int dia = this.day + 1, mes = this.month, ano = this.year;
        if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31){
            mes++;
            dia = 1;
        }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
            mes++;
            dia = 1;
        }else if(((dia > 29 && mes == 2) && (ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0))){
            mes++;
            dia = 1;
        }else if((dia > 28 && mes == 2) && !(ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0)){
            mes++;
            dia = 1;
        }
        if(mes > 12){
            mes = 1;
            ano++;
        }
        return new Date(dia, mes, ano);
    }

    public Date yesterday() {
        int dia = this.day - 1, mes = this.month, ano = this.year;
        if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia < 1){
            if((mes == 3 && (ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0))) dia = 29;
            else if(mes == 3) dia = 28;
            else dia = 30;
            mes--;
        }else if((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 1){
            mes--;
             dia = 31;
        }
        if(mes < 1){
            mes = 12;
            ano--;
        }
         return new Date(dia, mes, ano);
    }

    public Date plusDays(int i) {
        int dia = this.day, mes = this.month, ano = this.year;
        for(int j = 0; j < i; j++){
            dia ++;
            if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31){
                mes++;
                dia = 1;
            }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
                mes++;
                dia = 1;
            }else if(((dia > 29 && mes == 2) && (ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0))){
                mes++;
                dia = 1;
            }else if((dia > 28 && mes == 2) && !(ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0)){
                mes++;
                dia = 1;
            }
            if(mes > 12){
                mes = 1;
                ano++;
            }
        }
        return new Date(dia, mes, ano);
    }

    public Date minusDays(int i) {
       int dia = this.day, mes = this.month, ano = this.year;
       while(i > 0){  
           dia--;
           i--;
            if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia < 1){
                if((mes == 3 && (ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0))) dia = 29;
                else if(mes == 3) dia = 28;
                else dia = 30;
                mes--;
            }else if((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 1){
                mes--;
                 dia = 31;
            }
            if(mes < 1){
                mes = 12;
                ano--;
            }
       }
       return new Date(dia, mes, ano);
    }
    
}
