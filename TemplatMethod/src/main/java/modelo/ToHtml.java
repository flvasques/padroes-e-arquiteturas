
package modelo;

public class ToHtml extends Conversor {
    
    public ToHtml(){
        super();
    }
    
    @Override
    protected boolean converter() {
        super.gravavel = "<!DOCTYPE htnl>\n<html>\n\t<head>\n\t</head>\n\t<body>\n";
        super.gravavel += "\t\t<table>\n\t\t\t<tr>\n";
        for(int i = 0; i < super.cabecalho.size(); i++) {
           super.gravavel += "\t\t\t\t<th>" + super.cabecalho.get(i) + "</th>\n";
        }
        super.gravavel += "\t\t\t</tr>\n";
        for(int i = 0; i < super.dados.size(); i++){
            super.gravavel += "\t\t\t<tr>\n";
            for(int j = 0; j <super.dados.get(i).getDados().length; j++){
                super.gravavel += "\t\t\t\t<td>" + super.dados.get(i).getDados()[j] + "</td>\n";
            }
            super.gravavel += "\t\t\t</tr>\n";
        }
        super.gravavel += "\t\t<table>\n\t</body>\n</html>";
        return true;
    }
    
}
