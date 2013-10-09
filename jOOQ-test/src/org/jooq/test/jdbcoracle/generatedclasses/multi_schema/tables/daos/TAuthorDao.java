/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthorDao extends org.jooq.impl.DAOImpl<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TAuthorRecord, org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor, java.lang.Integer> {

	/**
	 * Create a new TAuthorDao without any configuration
	 */
	public TAuthorDao() {
		super(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR, org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor.class);
	}

	/**
	 * Create a new TAuthorDao with an attached configuration
	 */
	public TAuthorDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR, org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.ID, value);
	}

	/**
	 * Fetch records that have <code>FIRST_NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByFirstName(java.lang.String... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.FIRST_NAME, values);
	}

	/**
	 * Fetch records that have <code>LAST_NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByLastName(java.lang.String... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.LAST_NAME, values);
	}

	/**
	 * Fetch records that have <code>DATE_OF_BIRTH IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByDateOfBirth(java.sql.Date... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.DATE_OF_BIRTH, values);
	}

	/**
	 * Fetch records that have <code>YEAR_OF_BIRTH IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByYearOfBirth(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.YEAR_OF_BIRTH, values);
	}

	/**
	 * Fetch records that have <code>ADDRESS IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByAddress(java.lang.Object... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.ADDRESS, values);
	}
}