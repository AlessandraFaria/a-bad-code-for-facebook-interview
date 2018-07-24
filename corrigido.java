public class solution {
public boolean MaxOrMin(final List<String> a, String ord){

String valor_ord[]=ord.Split("");


	for (int c = 0 ; c<a.size() ; c++){
		String valor_Lista[]=a.get(c).Split("");


		for (int t=0 ;  t<v.size() ; t++){
			if(valor_ord.get(t)!='a' && valor_ord.get(t)!='c' && valor_ord.get(t)!='b' ){
				return false;
			}
		
			else{
				if(valor_ord.get(t)=='a'&& valor_Lista.get(k)!='a'){
					return false;
				}
				else if(valor_ord.get(t)!='a'&& valor_Lista.get(k)=='a'){
					return true;
				}
				else{
					resultado_lista = Valores(valor_Lista.get(t));
					resultado_ord = Valores(valor_ord.get(t));
					if(resultado_lista>resultado_ord){
						return false;
					}
					else if(resultado_ord>resultado_lista){
						return true;
					}
				}
			}

		}

	}
}


public int Valores(String value){
	Integer retorno=0;
	swicth(value){
		case 'a':
			retorno= 15;
			breack;

		case 'b':
			retorno= 5;
			breack;

		case 'c':
			retorno = 2;
			breack;

	}
return retorno;

}
}



