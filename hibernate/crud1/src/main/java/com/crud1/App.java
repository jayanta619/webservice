package com.crud1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

import dao.PostDAOImpl;

public class App {
	public static void main(String[] args) {
//		Configuration config = new Configuration();
//		config.configure("hibernate.cfg.xml");
//
//		SessionFactory factory = config.buildSessionFactory();
//		Session session = factory.openSession();
//
//		Transaction transaction = session.beginTransaction();
//
//		Post p = new Post(0, "body of the post", "title of the post");
//		session.save(p);
//		transaction.commit();
//
//		System.out.println("Post Saved");

		Scanner scan = new Scanner(System.in);
		PostDAOImpl impl = new PostDAOImpl();
		
		int doChoice = 0;

		do {
			System.out.println("1.Insert\t2.Update\t3.Delete\t4.View");
			int choice = scan.nextInt();
			Post p = new Post();
			switch (choice) {
			case 1:
				System.out.println("Enter title and body");
				p = new Post();
				p.setTitle(scan.next());
				p.setBody(scan.next());
				Post res = impl.insert(p);
				System.out.println(res);
				break;

			case 2:
				System.out.println("Enter id, title and body");
				p = new Post();
				p.setId(scan.nextInt());
				scan.nextLine();
				p.setTitle(scan.nextLine());
				p.setBody(scan.nextLine());
				Post res1 = impl.update(p);
				System.out.println(res1);
				break;

			case 3:
				System.out.println("Enter id");
				p = new Post();
				p.setId(scan.nextInt());
				scan.nextLine();
				Status s = impl.delete(p);
				System.out.println(s);
				break;

			case 4:
				List<Post> list = impl.view();
				for (Post post : list) {
					System.out.println(post);
				}
				break;

			default:
				break;
			}

			System.out.println("1.Re Run\t\t2.Exit");
			doChoice = scan.nextInt();

		} while (doChoice == 1);

		System.out.println("********Good Bye For Now********");

	}

		
		
	}

