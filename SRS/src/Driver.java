import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.proxy.annotation.SetDelegate;

public class Driver {

	static Connection conn;
	static int guiFlag = 0;
	public static int cnt;
	public static Connection getConn() {
		return conn;
	}

	
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
		ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");

			 System.out.println("Enter Username");
			 String Uname=sc.next();
			 System.out.println("Enter Password");
			 String Pass=sc.next();
		
			conn = ds.getConnection(Uname, Pass);
			new Options().setVisible(true);
			int choice;
			// Display the functions to be carried out in the form of a menu driven
			// interface. If GUI is required select option 7.
			do {

				System.out.println("1.Display Tables");
				System.out.println("2.Display Class TAs");
				System.out.println("3.Get Prerequisites");
				System.out.println("4.Drop Student from a class");
				System.out.println("5.Delete Student");
				System.out.println("6.Enroll Student");
				System.out.println("7.GUI");
				System.out.println("8.Exit");
				choice = sc.nextInt();
				if (choice == 7) {
					guiFlag = 1;
					
				}
				if (choice == 1) {
					int tChoice;
					System.out.println("1.Display Students Table");
					System.out.println("2.Display TAs Table");
					System.out.println("3.Display Courses Table");
					System.out.println("4.Display Prerequisites Table");
					System.out.println("5.Display Classes Table");
					System.out.println("6.Display Enrollments Table");
					System.out.println("7.Display Logs Table");
					tChoice = sc.nextInt();
					if (tChoice == 1) {
						displayStudents(conn);
					}
					if (tChoice == 2) {
						displayTAs(conn);
					}
					if (tChoice == 3) {
						displayCourses(conn);
					}
					if (tChoice == 4) {
						displayPrerequisites(conn);
					}
					if (tChoice == 5) {
						displayClasses(conn);
					}
					if (tChoice == 6) {
						displayEnrollments(conn);
					}
					if (tChoice == 7) {
						displayLogs(conn);
					}
				}
				if (choice == 2) {
					System.out.println("Enter ClassID");
					String classid = sc.next();
					ClassTAs(conn, classid);
				}
				if (choice == 3) {
					System.out.println("Enter DeptCode");
					String deptcode = sc.next();
					System.out.println("Enter Course#");
					int course_in = sc.nextInt();
					CheckPrerequisites(conn, deptcode, course_in);
				}
				if (choice == 4) {
					System.out.println("Enter B#");
					String bNumber = sc.next();
					System.out.println("Enter ClassID");
					String classid = sc.next();
					deleteStudentFromClass(conn, bNumber, classid);
				}
				if (choice == 5) {
					System.out.println("Enter B#");
					String bNumber = sc.next();
					deleteStudent(conn, bNumber);
				}
				if (choice == 6) {
					System.out.println("Enter B#");
					String bNumber = sc.next();
					System.out.println("Enter ClassID");
					String classid = sc.next();
					enrollStudent(conn, bNumber, classid);
				}
				if (choice == 8) {
					conn.close();
					System.exit(1);
				}
			} while (choice != 8);
		
	}

	// Following function displays the Logs table
	public static ResultSet displayLogs(Connection conn2) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall(" begin procedures.ShowLogs(?);end; ");
		CalStmt.registerOutParameter(1, OracleTypes.CURSOR);
		CalStmt.execute();

		ResultSet rSet = (ResultSet) CalStmt.getObject(1);
		if (guiFlag != 1)
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1) + "\t" + colHeader.getColumnName(2) + "\t"
						+ colHeader.getColumnName(3) + "\t" + colHeader.getColumnName(4) + "\t"
						+ colHeader.getColumnName(5) + "\t" + colHeader.getColumnName(6));
				while (rSet.next()) {
					System.out.println(rSet.getString(1) + "\t" + rSet.getString(2) + "\t" + rSet.getString(3) + "\t"
							+ rSet.getString(4) + "\t" + rSet.getString(5) + "\t" + rSet.getString(6));
				}
			}

		// CalStmt.close();
		return rSet;

	}

	// Following function displays the Enrollments table
	public static ResultSet displayEnrollments(Connection conn2) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall(" begin procedures.ShowEnrollment(?);end; ");
		CalStmt.registerOutParameter(1, OracleTypes.CURSOR);
		CalStmt.execute();

		ResultSet rSet = (ResultSet) CalStmt.getObject(1);
		if (guiFlag != 1)
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1) + "\t" + colHeader.getColumnName(2) + "\t"
						+ colHeader.getColumnName(3));
				while (rSet.next()) {
					System.out.println(rSet.getString(1) + "\t" + rSet.getString(2) + "\t" + rSet.getString(3));
				}
			}

		// CalStmt.close();
		return rSet;

	}

	// Following function displays the Classes table
	public static ResultSet displayClasses(Connection conn2) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall(" begin procedures.ShowClasses(?);end; ");
		CalStmt.registerOutParameter(1, OracleTypes.CURSOR);
		CalStmt.execute();

		ResultSet rSet = (ResultSet) CalStmt.getObject(1);
		if (guiFlag != 1)
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1) + "\t" + colHeader.getColumnName(2) + "\t"
						+ colHeader.getColumnName(3) + colHeader.getColumnName(4) + "\t" + colHeader.getColumnName(5)
						+ "\t" + colHeader.getColumnName(6) + "\t" + colHeader.getColumnName(7) + "\t"
						+ colHeader.getColumnName(8) + "\t" + colHeader.getColumnName(9) + "\t"
						+ colHeader.getColumnName(10));
				while (rSet.next()) {
					System.out.println(rSet.getString(1) + "\t" + rSet.getString(2) + "\t" + rSet.getInt(3)
							+ rSet.getInt(4) + "\t" + rSet.getInt(5) + "\t" + rSet.getString(6) + "\t" + rSet.getInt(7)
							+ "\t" + rSet.getInt(8) + "\t" + rSet.getString(9) + "\t" + rSet.getString(10));
				}
			}

		// CalStmt.close();
		return rSet;
	}

	// Following function displays the Prerequisites table
	public static ResultSet displayPrerequisites(Connection conn2) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall(" begin procedures.ShowPrerequisite(?);end; ");
		CalStmt.registerOutParameter(1, OracleTypes.CURSOR);
		CalStmt.execute();

		ResultSet rSet = (ResultSet) CalStmt.getObject(1);
		if (guiFlag != 1)
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1) + "\t" + colHeader.getColumnName(2) + "\t"
						+ colHeader.getColumnName(3) + "\t" + colHeader.getColumnName(4));
				while (rSet.next()) {
					System.out.println(rSet.getString(1) + "\t" + rSet.getInt(2) + "\t" + rSet.getString(3) + "\t"
							+ rSet.getInt(4));
				}
			}

		// CalStmt.close();
		return rSet;

	}

	// Following function displays the Courses table
	public static ResultSet displayCourses(Connection conn2) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall(" begin procedures.ShowCourses(?);end; ");
		CalStmt.registerOutParameter(1, OracleTypes.CURSOR);
		CalStmt.execute();

		ResultSet rSet = (ResultSet) CalStmt.getObject(1);
		if (guiFlag != 1)
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1) + "\t" + colHeader.getColumnName(2) + "\t"
						+ colHeader.getColumnName(3));
				while (rSet.next()) {
					System.out.println(rSet.getString(1) + "\t" + rSet.getInt(2) + "\t" + rSet.getString(3));
				}
			}
		// CalStmt.close();
		return rSet;

	}

	// Following function displays the TAs table
	public static ResultSet displayTAs(Connection conn2) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall(" begin procedures.ShowTAs(?);end; ");
		CalStmt.registerOutParameter(1, OracleTypes.CURSOR);
		CalStmt.execute();

		ResultSet rSet = (ResultSet) CalStmt.getObject(1);
		if (guiFlag != 1)
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1) + "\t" + colHeader.getColumnName(2) + "\t"
						+ colHeader.getColumnName(3));
				while (rSet.next()) {
					System.out.println(rSet.getString(1) + "\t" + rSet.getString(2) + "\t" + rSet.getString(3));
				}
			}
		// CalStmt.close();
		return rSet;

	}

	// Following function enrolls a student in the class
	public static String enrollStudent(Connection conn2, String bNumber, String classid) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall("begin procedures.EnrollStudent(?, ?, ?);end; ");

		CalStmt.setString(1, bNumber);
		CalStmt.setString(2, classid);
		CalStmt.registerOutParameter(3, OracleTypes.VARCHAR);
		CalStmt.execute();

		String errorMsg = CalStmt.getString(3);

		if (errorMsg != null) {
			System.out.println(errorMsg);
		}

		// CalStmt.close();
		return errorMsg;
	}

	// Following function deletes a Student
	public static String deleteStudent(Connection conn2, String bNumber) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall("begin procedures.deleteStudent(?, ?);end;");

		CalStmt.setString(1, bNumber);
		CalStmt.registerOutParameter(2, OracleTypes.VARCHAR);
		CalStmt.execute();

		String errorMsg = CalStmt.getString(2);

		if (errorMsg != null) {
			System.out.println(errorMsg);
		}

		// CalStmt.close();
		return errorMsg;

	}

	// Following function deletes a Student from a class
	public static String deleteStudentFromClass(Connection conn2, String bNumber, String classid) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement CalStmt = conn.prepareCall("begin procedures.ClassStudentDrop(?, ?, ?);end;");

		CalStmt.setString(1, bNumber);
		CalStmt.setString(2, classid);
		CalStmt.registerOutParameter(3, OracleTypes.VARCHAR);
		CalStmt.execute();

		String errorMsg = CalStmt.getString(3);

		if (errorMsg != null) {
			System.out.println(errorMsg);
		}
		// CalStmt.close();
		return errorMsg;
	}

	// Following function is used to display the prerequisites of a class
	public static ResultSet CheckPrerequisites(Connection conn2, String deptcode, int course_in) throws SQLException {
		// TODO Auto-generated method stub

		CallableStatement CalStmt = conn.prepareCall("begin procedures.CheckPrerequisites(?, ?, ?,?);end;");

		CalStmt.setString(1, deptcode);
		CalStmt.setInt(2, course_in);
		CalStmt.registerOutParameter(3, OracleTypes.CURSOR);
		CalStmt.registerOutParameter(4, OracleTypes.VARCHAR);
		CalStmt.execute();
		String errorMsg = CalStmt.getString(4);
		ResultSet rSet = null;
		Object returnObject = null;
		if (errorMsg != null) {
			System.out.println(errorMsg);
			returnObject = errorMsg;
		} else {
			rSet = (ResultSet) CalStmt.getObject(3);
			if (rSet.getFetchSize() == 0) {
				returnObject = "No prerequisites";
			} else
				returnObject = rSet;
		}
		if (guiFlag != 1) {
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1));
				while (rSet.next()) {
					System.out.println(rSet.getString(1));
				}
			}
		}
		// CalStmt.close();
		return rSet;
	}

	// Following function displays the TAs for a class
	public static Object ClassTAs(Connection conn2, String classid) throws SQLException {
		ResultSet rSet = null;
		Object returnObject = null;
		CallableStatement CalStmt = conn.prepareCall("begin procedures.ShowClassTA(?, ?, ?);end;");
		CalStmt.setString(1, classid);
		CalStmt.registerOutParameter(2, OracleTypes.VARCHAR);
		CalStmt.registerOutParameter(3, OracleTypes.CURSOR);
		CalStmt.execute();

		String errorMsg = CalStmt.getString(2);

		if (errorMsg != null) {
			System.out.println(errorMsg);
			returnObject = errorMsg;
		} else {
			rSet = (ResultSet) CalStmt.getObject(3);
			returnObject = rSet;
		}
		if (guiFlag != 1) {
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1) + "\t" + colHeader.getColumnName(2) + "\t"
						+ colHeader.getColumnName(3));
				while (rSet.next()) {
					System.out.println(rSet.getString(1) + "\t" + rSet.getString(2) + "\t" + rSet.getString(3));
				}
			}
		}
		// CalStmt.close();
		return returnObject;
		// TODO Auto-generated method stub

	}

	// Following function displays the Student table
	public static ResultSet displayStudents(Connection conn) throws SQLException {
		CallableStatement CalStmt = conn.prepareCall(" begin procedures.ShowStudents(?);end;");
		CalStmt.registerOutParameter(1, OracleTypes.CURSOR);
		CalStmt.execute();
		ResultSet rSet = (ResultSet) CalStmt.getObject(1);
		if (guiFlag != 1) {
			if (rSet != null) {
				ResultSetMetaData colHeader = rSet.getMetaData();
				System.out.println("\n" + colHeader.getColumnName(1) + "\t" + colHeader.getColumnName(2) + "\t"
						+ colHeader.getColumnName(3) + "\t" + colHeader.getColumnName(4) + "\t"
						+ colHeader.getColumnName(5) + "\t" + colHeader.getColumnName(6) + "\t"
						+ colHeader.getColumnName(7) + "\t" + colHeader.getColumnName(8));
				while (rSet.next()) {
					System.out.println(rSet.getString(1) + "\t" + rSet.getString(2) + "\t" + rSet.getString(3) + "\t"
							+ rSet.getString(4) + "\t" + rSet.getDouble(5) + "\t" + rSet.getString(6) + "\t"
							+ rSet.getString(7) + "\t" + rSet.getString(8));
				}

			}
		}
		// CalStmt.close();
		return rSet;
	}

}
