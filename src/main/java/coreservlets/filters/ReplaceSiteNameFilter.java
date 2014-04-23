package coreservlets.filters;

/** Filter that changes all occurrences of "filtersRus.com" to "weBefilters.com".
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, 
 *  Spring, Hibernate, JPA, and Java</a>.
 */

public class ReplaceSiteNameFilter extends ReplaceFilter {
  public String getTarget() {
    return("filtersRus.com");
  }

  public String getReplacement() {
    return("weBefilters.com");
  }
}
