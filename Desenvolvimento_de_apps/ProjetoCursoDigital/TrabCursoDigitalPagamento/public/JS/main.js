const mascaraCpf = (i)=>{
    var v = i.value;
   
   if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
      i.value = v.substring(0, v.length-1);
      return;
   }
   
   i.setAttribute("maxlength", "14");
   if (v.length == 3 || v.length == 7) i.value += ".";
   if (v.length == 11) i.value += "-";
}

const codigoCartao = (a) =>{
    var v = a.value;
    if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
        b.value = v.substring(0, v.length-1);
        return;
     }
     a.setAttribute("maxlength", "3");
     
}

const dataDeValidade = (b)=>{
    var v = b.value;
    if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
        b.value = v.substring(0, v.length-1);
        return;
     }
     
     b.setAttribute("maxlength", "5");
     if (v.length == 2) b.value += "/";
     
}

