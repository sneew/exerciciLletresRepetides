function imprimir(){
    //fase 1
    document.write("fase1" + "</br>");
    var n1 = "eloi";
    var arrName1 = n1.split('');
    
    for (var i = 0; i < arrName1.length; i++) {
        document.write(arrName1[i] + "</br>");
    }
    
    //fase 2
    document.write("</br>" + "fase2" + "</br>");
    var n = "iraida";
    var name = new Array();
    
    for (var i = 0; i < n.length; i++) {
        var c = n.charAt(i);
        name.push(c);
    }
    
    for (var i = 0; i < name.length; i++) {
        var num = parseInt(name[i]);
        if(num <= 0 || num > 0) {
            document.write("Els noms de persones no contenen números!");
        } else {
            document.write(name[i] + "</br>");
            switch (name[i]) {
            case 'a':
                document.write("VOCAL" + "</br>");
                break;
            
            case 'A':
                document.write("VOCAL" + "</br>");
                break;
                
            case 'e':
                document.write("VOCAL" + "</br>");
                break;
                
            case 'E':
                document.write("VOCAL" + "</br>");
                break;

            case 'i':
                document.write("VOCAL" + "</br>");
                break;
                
            case 'I':
                document.write("VOCAL" + "</br>");
                break;
                
            case 'o':
                document.write("VOCAL" + "</br>");
                break;
                
            case 'O':
                document.write("VOCAL" + "</br>");
                break;
                
            case 'u':
                document.write("VOCAL" + "</br>");
                break;
                
            case 'U':
                document.write("VOCAL" + "</br>");
                break;
                
            default:
                document.write("CONSONANT" + "</br>");
                break;
            }
        }
    }
    
    //fase 3
    document.write("</br>" + "fase3" + "</br>");
    var numeroLletres = new Map();
    
    for (var i = 0; i < name.length; i++) {
        var num = 0;
        for (var j = 0; j < name.length; j++) {
            if (name[i]==name[j]) {
                num++;
            }
        }
        numeroLletres.set(name[i], num);
    }
    for (var[key, valor] of numeroLletres){
        document.write(key + " = " + valor + "</br>");
    }
    
    //fase 4
    document.write("</br>" + "fase4" + "</br>");
    var surname = new Array();
    var snm = "Fernandez";
    for (var i = 0; i < snm.length; i++) {
        var c = snm.charAt(i);
        surname.push(c);
    }
    
    var fullName = new Array();
    
    for (var i = 0; i < name.length; i++) {
        if(i<name.length) {
            var c = name[i];
            fullName.push(c);
        }
    }
    
    fullName.push(' ');
    
    for (var i = 0; i < surname.length; i++) {
        var c = surname[i];
        fullName.push(c);
    }
    
    document.write("FullName: " + fullName);
}