package business;

import data.CollabsDataMock;
import enums.GradeEnum;
import model.Collab;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CollabBusinessImpl implements CollabBusiness {


/** Creating a new List of Collabs from datamock **/
    List<Collab> Collabs= CollabsDataMock.getCollabs();

    /** get Collab by his ID **/
    public Optional<Collab> get (String id){

        return Collabs.stream().
                filter(Collab -> Objects.equals(Collab.getEmp_id(), id)).findFirst();
    }


    public Optional<Collab> getCollabSalary(GradeEnum grade) {
        return Optional.empty();
    }

    /** get Collabs by his Grade **/

     public Optional<Collab> getCollabgrade (GradeEnum grade){

     return Collabs.stream().
     filter(Collab -> Objects.equals(Collab.getGrade(), grade)).findFirst();
     }



    /** get Collab by his email **/
    public Optional<Collab> getCollabbyemail (String email){

        return Collabs.stream().
                filter(Collab -> Objects.equals(Collab.getEmail(), email)).findFirst();
    }


    /** List all his Collabs **/
    public List<Collab> getList() {return Collabs;}
}
