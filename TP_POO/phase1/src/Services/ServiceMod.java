package Services;
import classes.Enseignant;
import classes.Filiere;
import classes.Module;

import java.util.ArrayList;

public class ServiceMod {
   public static Module addModule(Integer id, String nomMod, Enseignant professeur, Filiere filiere) {
       Module module = new Module();
       module.setId(id);
        module.setNomMod(nomMod);
       module.setProfesseur(professeur);
       module.setFiliere(filiere);
       module.setId(Fichiers.getModId());
       Fichiers.modules.add(module);
       return module;
    }

    public static Module updateModule(int id , String nomMod, Enseignant professeur, Filiere filiere){
        for(Module module : Fichiers.modules){
            if(module.getId() == id){
                module.setNomMod(nomMod);
                module.setProfesseur(professeur);
                module.setFiliere(filiere);
                return module;
            }
        }
        return null;

    }
    public static ArrayList<Module> deleteModuleById(int id){
        ArrayList<Module> modulesToRemove = new ArrayList<>();
        for(Module module : Fichiers.modules){
            if(module.getId() == id){
                modulesToRemove.add(module);
            }
        }
        Fichiers.modules.removeAll(modulesToRemove);
        return modulesToRemove;
    }

    public static Module getModuleById(int id){
        for(Module module : Fichiers.modules){
            if(module.getId() == id){
                return module;
            }
        }
        return null;
    }
    public static ArrayList<Module> getAllModule(){
        return Fichiers.modules;
    }

}
