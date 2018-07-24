public class solution {
public boolean MaxOrMin(List<string> a, String ord){

  //a = ['cc', 'cb']
  // ord = 'cba'
  
  for (int c = 0 ; c<a.size() ; c++){
    k=a.get().Split("");
    //k= [[c,c] ,[c,b]]
    v=ord.Split("");
    //v=[c,b,a]
   
  for (int t=0 ;  t<v.size() ; t++){
    //t=0
    //v.v.get(c) = c
     if(v.get(c)!='a' && v.get(c)!='c' && v.get(c)!='b' ){
      return false;
      
  }
    else{
      //k.get(c) =c v.get(t) =c
    if(k.get(c)=='a' && v.get(t)=='b'){
      return false; 
    
    }
     else if(k.get(c)=='b' && v.get(t)=='c'){
      return false; 
    
    }
     else if(k.get(c)=='c' && v.get(t)=='c' ){
      return false; 
       //false
    
    }
    else {
    return true;
    }
    }
  
  }
  }

  
}
  
  

}