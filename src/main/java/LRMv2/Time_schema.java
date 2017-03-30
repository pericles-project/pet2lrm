package LRMv2;

/* CVS $Id: $ */

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * Vocabulary definitions from time-schema.ttl
 * 
 * @author Auto-generated by schemagen on 24 Jun 2015 10:53
 */
public class Time_schema {
	/**
	 * <p>
	 * The ontology model that holds the vocabulary terms
	 * </p>
	 */
	private static OntModel m_model = ModelFactory.createOntologyModel(
			OntModelSpec.RDFS_MEM, null);

	/**
	 * <p>
	 * The namespace of the vocabulary as a string
	 * </p>
	 */
	public static final String NS = "http://xrce.xerox.com/LRM#";

	/**
	 * <p>
	 * The namespace of the vocabulary as a string
	 * </p>
	 * 
	 * @see #NS
	 */
	public static String getURI() {
		return NS;
	}

	/**
	 * <p>
	 * The namespace of the vocabulary as a resource
	 * </p>
	 */
	public static final Resource NAMESPACE = m_model.createResource(NS);

}
