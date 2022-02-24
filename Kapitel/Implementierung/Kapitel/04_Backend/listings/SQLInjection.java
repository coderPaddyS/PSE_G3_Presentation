public interface AliasRepository extends JpaRepository<Alias, Long> {
    @Query("SELECT a FROM Alias AS a WHERE a.mapID=:mapID")
    Iterable<Alias> findByMapID(@Param("mapID") int mapID);
}
