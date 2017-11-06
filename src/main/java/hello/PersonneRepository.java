


@repository
public interface PersonneRepository extends CrudRepository<Personne,Integer>{


    // métodes héritées :
    //long count()
    //void delete(int id)
    //boolean exists(int id)
    //Iterable<Personne> findAll()
    //Personne findOne()
    //Personne save(Personne p)


    public List<Personne> findByName(String Name);
}
