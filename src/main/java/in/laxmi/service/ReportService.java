package in.laxmi.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	//@Scheduled(fixedRate=5000)
	@Scheduled(cron = "* */3 * * * *")
	public void generateReport() {
		System.out.println("report generated");
	}
}
