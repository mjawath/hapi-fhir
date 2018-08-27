package sgd.lab.controller;

import ca.uhn.fhir.jpa.provider.JpaResourceProviderDstu2;
import ca.uhn.fhir.jpa.provider.dstu3.JpaResourceProviderDstu3;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.api.server.RequestDetails;
import ca.uhn.fhir.rest.server.IResourceProvider;
import org.hl7.fhir.instance.model.Organization;

import javax.servlet.http.HttpServletRequest;

public class SampleMasterController  extends JpaResourceProviderDstu3<Organization> {
	@Override
	public MethodOutcome create(HttpServletRequest theRequest, Organization theResource, String theConditional, RequestDetails theRequestDetails) {
		return super.create(theRequest, theResource, theConditional, theRequestDetails);
	}

}
