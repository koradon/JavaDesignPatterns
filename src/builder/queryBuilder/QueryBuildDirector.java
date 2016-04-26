package builder.queryBuilder;

/**
 * Created by mics on 4/14/16.
 */
public class QueryBuildDirector {
    public Query buildQuery(String from, String where, QueryBuilder builder){
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}
