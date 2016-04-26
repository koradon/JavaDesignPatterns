package builder.queryBuilder;

/**
 * Created by mics on 4/14/16.
 */
public interface QueryBuilder {
    void from(String from);
    void where(String where);
    Query getQuery();
}
