package business;

import enums.GradeEnum;
import model.Collab;

import java.util.List;
import java.util.Optional;

public interface CollabBusiness {

        /**
         * Get Collab by id
         *
         * @param emp_id Collab identifiant
         * @return Collab find by emp_id
         */
        Optional<Collab> get(String emp_id);

        /**
         * Get Collab by grade
         *
         * @param grade Collab identifiant
         * @return Collab find by grade
         */
        Optional<Collab> getCollabgrade(GradeEnum grade);

        /**
         * Get Collab by email
         *
         * @param email Collab identifiant
         * @return Collab find by email
         */
        Optional<Collab> getCollabbyemail(String email);


        /**
         * Get student list
         *
         * @return list of Collabs
         */
        List<Collab> getList();

    }
