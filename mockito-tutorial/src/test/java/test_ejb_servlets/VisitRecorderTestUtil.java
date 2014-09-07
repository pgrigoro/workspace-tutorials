package test_ejb_servlets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import test_ejb_servlets.Visit;


public class VisitRecorderTestUtil {

	public static List<Visit> createTestVisitList() {
		List<Visit> visitList = new ArrayList<Visit>();
		Visit visit = new Visit();
		visit.setVisitTime(new Date());
		visitList.add(visit);
		return visitList;
	}

}