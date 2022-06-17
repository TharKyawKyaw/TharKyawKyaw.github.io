package application.service;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import application.entity.Author;
import application.entity.Book;
import application.entity.Category;
import application.entity.Librarian;
import application.entity.Member;
import application.entity.Transaction;

public class DatabaseService {
	

	public static Librarian login(String name, String password) {
		Librarian librarian = null;
		
		try(var con = MyConnection.getConnection()) {
			
			var query = "SELECT * FROM librarians WHERE name = ? AND password = ?";
			
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setString(2, password);
			
			var rs = pstm.executeQuery();
			if(rs.next()) {
				librarian = new Librarian();
				librarian.setName(rs.getString("name"));
				librarian.setPassword(rs.getString("password"));
				librarian.setId(rs.getInt("id"));
				return librarian;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return librarian;
	}

	public static Librarian logout() {
		Librarian librarian = null;
		return librarian;
	}


	public static List<Author> findAllAuthors() {
		List<Author> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			String query = "SELECT * FROM authors ORDER BY id ASC";
			
			PreparedStatement pstm = con.prepareStatement(query);
			var rs = pstm.executeQuery();
			while(rs.next()) {
				
				var author = new Author();
				author.setId(rs.getInt("id"));
				author.setName(rs.getString("name"));
				author.setCity(rs.getString("city"));
				author.setBirthday(LocalDate.parse(rs.getString("birthday")));
				
				list.add(author);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}


	public static void saveAuthor(Author author) {
		
		try(var con = MyConnection.getConnection()) {
			
			String insert = "INSERT INTO authors(name,city,birthday) VALUES (?,?,?) ";
			
			PreparedStatement pstm = con.prepareStatement(insert);
			pstm.setString(1, author.getName());
			pstm.setString(2, author.getCity());
			pstm.setDate(3, Date.valueOf(author.getBirthday()));
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void deleteAuthorById(int id) {
		
		try(var con = MyConnection.getConnection()) {
			
			var delete = "DELETE FROM authors WHERE id = ?";
			
			PreparedStatement pstm = con.prepareStatement(delete);
			pstm.setInt(1,id);
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void updateAuthor(Author author) {
		
		try(var con = MyConnection.getConnection()) {
			
			var update = "UPDATE authors SET name = ? , city = ? , birthday = ? WHERE id = ?";
			
			PreparedStatement pstm = con.prepareStatement(update);
			pstm.setString(1, author.getName());
			pstm.setString(2, author.getCity());
			pstm.setDate(3, Date.valueOf(author.getBirthday()));
			pstm.setInt(4, author.getId());
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static List<Category> findAllCategories() {
		
		List<Category> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			String query = "SELECT * FROM categories";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			var rs = pstm.executeQuery();
			
			while(rs.next()) {
				Category cate = new Category();
				cate.setId(rs.getInt("id"));
				cate.setName(rs.getString("name"));
				
				list.add(cate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	
	public static void updateCategory(Category category) {
		
		try(var con = MyConnection.getConnection()) {
			
			var update = "UPDATE categories SET name = ? WHERE id = ?";
			
			PreparedStatement pstm = con.prepareStatement(update);
			pstm.setString(1, category.getName());
			pstm.setInt(2, category.getId());
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void deleteCategoryById(int id) {
		
		try(var con = MyConnection.getConnection()) {
			
			var delete = "DELETE FROM categories WHERE id = ?";
			
			PreparedStatement pstm = con.prepareStatement(delete);
			pstm.setInt(1, id);
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	public static void saveCategory(String name) {
		
		try(var con = MyConnection.getConnection()) {
			
			var insert = "INSERT INTO categories(name) VALUES(?)";
			
			PreparedStatement pstm = con.prepareStatement(insert);
			pstm.setString(1, name);
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static List<Category> searchCategory(String category) {
		
		List<Category> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			var query = """
					SELECT *
					FROM categories c
					""";
			
			List<Object> params = new ArrayList<>();
			if(!category.isEmpty()) {
				query += " WHERE c.name LIKE ?";
				params.add("%" + category + "%");
			}

			PreparedStatement pstm = con.prepareStatement(query);
			
			for(var i = 0; i < params.size(); i++) {
				pstm.setObject(i+1, params.get(i));
			}
			
			var rs = pstm.executeQuery();
			
			while(rs.next()) {
				Category cate = new Category();
				cate.setId(rs.getInt("id"));
				cate.setName(rs.getString("name"));
				
				list.add(cate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	

	public static List<Member> findAllMembers() {
		
		List<Member> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			var query = "SELECT * FROM members";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			var rs = pstm.executeQuery();
			while(rs.next()) {
				
				Member m = new Member();
				m.setCard_id(rs.getInt("card_id"));
				m.setName(rs.getString("name"));
				m.setRoll_no(rs.getInt("roll_no"));
				m.setClass_year(rs.getString("class_year"));
				m.setAcademic_year(rs.getString("academic_year"));
				m.setRegister_date(LocalDate.parse(rs.getString("register_date")));
				m.setExpired_date(LocalDate.parse(rs.getString("expired_date")));
				
				list.add(m);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public static boolean saveMember(Member mb) {
		
		boolean result = false;
		
		try(var con = MyConnection.getConnection()) {
			
			var insert = "INSERT INTO members(card_id,name,roll_no,class_year,academic_year,register_date,expired_date)"
					+ "VALUES(?,?,?,?,?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(insert);
			pstm.setInt(1, mb.getCard_id());
			pstm.setString(2, mb.getName());
			pstm.setInt(3, mb.getRoll_no());
			pstm.setString(4, mb.getClass_year());
			pstm.setString(5, mb.getAcademic_year());
			pstm.setDate(6, Date.valueOf(mb.getRegister_date()));
			pstm.setDate(7, Date.valueOf(mb.getExpired_date()));
			
			pstm.executeUpdate();
			result = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public static List<Member> searchMember(String s_id, String s_name) {
		
		List<Member> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			var query = """
					SELECT * 
					FROM members m
					""";
			List<Object> params = new ArrayList<>();
			if(!s_id.isEmpty()) {
				query += " WHERE m.card_id LIKE ?";
				params.add("%" + s_id + "%"); 
			}
			if(!s_name.isEmpty()) {
				query += " WHERE m.name LIKE ?";
				params.add("%" + s_name + "%"); 
			}

			PreparedStatement pstm = con.prepareStatement(query);
			
			for(var i = 0; i < params.size(); i++) {
				pstm.setObject(i+1, params.get(i));
			}
			
			var rs = pstm.executeQuery();
			
			while(rs.next()) {
				Member member = new Member();
				member.setCard_id(rs.getInt("card_id"));
				member.setName(rs.getString("name"));
				member.setRoll_no(rs.getInt("roll_no"));
				member.setClass_year(rs.getString("class_year"));
				member.setAcademic_year(rs.getString("academic_year"));
				member.setRegister_date(LocalDate.parse(rs.getString("register_date")));
				member.setExpired_date(LocalDate.parse(rs.getString("expired_date")));
				
				
				list.add(member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public static void deleteMemberById(int card_id) {
		
		try(var con = MyConnection.getConnection()) {
			
			var delete = "DELETE FROM members WHERE card_id = ?";
			
			PreparedStatement pstm = con.prepareStatement(delete);
			pstm.setInt(1, card_id);
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void updateMember(Member mb) {
		
		try(var con = MyConnection.getConnection()) {
			
			var update = "UPDATE members SET name = ? , roll_no = ? , class_year = ? , academic_year = ?, register_date = ? , expired_date = ?  "
					+ "WHERE card_id = ?";
				
			PreparedStatement pstm = con.prepareStatement(update);

			pstm.setString(1, mb.getName());
			pstm.setInt(2, mb.getRoll_no());
			pstm.setString(3, mb.getClass_year());
			pstm.setString(4, mb.getAcademic_year());
			pstm.setDate(5, Date.valueOf(mb.getRegister_date()));
			pstm.setDate(6, Date.valueOf(mb.getExpired_date()));
			pstm.setInt(7, mb.getCard_id());
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static boolean saveBook(Book book) {
		
		boolean result = false;
		
		try(var con = MyConnection.getConnection()) {
			
			String query = "INSERT INTO books(code,title,category_id,author_id) VALUES(?,?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, book.getCode());
			pstm.setString(2, book.getTitle());
			pstm.setInt(3, book.getCategory().getId());
			pstm.setInt(4, book.getAuthor().getId());
			pstm.executeUpdate();
			result = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}

	public static List<Book> searchBook(String author, String category) {
		
		List<Book> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			var query = """
					SELECT b.code,b.title,a.name 'author', c.name 'category' , b.available
					FROM books b,authors a, categories c
					WHERE b.author_id = a.id AND b.category_id = c.id
					""";
			
			// need to change dynamic query
			List<Object> params = new ArrayList<>();
			if(!author.isEmpty()) {
				query += " AND a.name LIKE ?";
				params.add("%" + author + "%"); //%author%
			}
			if(!category.isEmpty()) {
				query += " AND c.name LIKE ?";
				params.add("%" + category + "%");
			}
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			for(var i = 0; i < params.size(); i++) {
				pstm.setObject(i+1, params.get(i));
			}
			
			var rs = pstm.executeQuery();
			
			while(rs.next()) {
				Book b = new Book();
				b.setCode(rs.getInt("code"));
				b.setTitle(rs.getString("title"));
				
				Author auth = new Author();
				auth.setName(rs.getString("author"));
				b.setAuthor(auth);
				
				Category cat = new Category();
				cat.setName(rs.getString("category"));
				b.setCategory(cat);
				
				b.setAvailable(rs.getInt("Available"));
				
				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}


	
	public static boolean updateBook(Book book) {
		
		try(var con = MyConnection.getConnection()) {
			
			String update = "UPDATE books SET title = ? ,  author_id = ? , category_id = ?  WHERE code = ?";
			
			PreparedStatement pstm = con.prepareStatement(update);
			pstm.setString(1, book.getTitle());
			pstm.setInt(2, book.getAuthor().getId());
			pstm.setInt(3,book.getCategory().getId());
			pstm.setInt(4, book.getCode());
			
			pstm.executeUpdate();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public static Book findBookByCode(String code) {
		Book book = null;
		try(var con = MyConnection.getConnection()) {
			
			var query = """
					SELECT b.*, a.name 'author', c.name 'category'
					FROM books b, authors a, categories c
					WHERE b.author_id = a.id AND b.category_id = c.id AND b.code = ?
					""";
			

			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, Integer.parseInt(code));
			
			var rs = pstm.executeQuery();

			if(rs.next()) {
				book = new Book();
				book.setCode(rs.getInt("code"));
				book.setTitle(rs.getString("title"));
				
				Author auth = new Author();
				auth.setId(rs.getInt("author_id"));
				auth.setName(rs.getString("author"));
				book.setAuthor(auth);
				
				Category cate = new Category();
				cate.setId(rs.getInt("category_id"));
				cate.setName(rs.getString("category"));
				book.setCategory(cate);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return book;
	}

	public static void deleteBookByCode(int code) {
		
		try(var con = MyConnection.getConnection()) {
			
			var delete = "DELETE FROM books WHERE code = ?";
			
			PreparedStatement pstm = con.prepareStatement(delete);
			pstm.setInt(1, code);
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static List<Book> findAllBooks() {
		
		List<Book> list = new ArrayList<>();
		try(var con = MyConnection.getConnection()) {
			
			var query = "SELECT b.code,b.title,a.name 'author', c.name 'category' , b.available 'available'"
					+ "FROM books b,authors a, categories c "
					+ "WHERE b.author_id = a.id AND b.category_id = c.id";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			var rs = pstm.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setCode(rs.getInt("code"));
				book.setTitle(rs.getString("title"));
				
				Category cate = new Category();
				cate.setName(rs.getString("category"));
				book.setCategory(cate);
				
				Author auth = new Author();
				auth.setName(rs.getString("author"));
				book.setAuthor(auth);
				
				book.setAvailable(rs.getInt("available"));
				
				list.add(book);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public static List<Librarian> findAllLibrarians() {
		
		List<Librarian> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			var query = "SELECT * FROM librarians";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			var rs = pstm.executeQuery();
			while(rs.next()) {
				Librarian lib = new Librarian();
				lib.setId(rs.getInt("id"));
				lib.setName(rs.getString("name"));
				lib.setPassword(rs.getString("password"));
				
				list.add(lib);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public static boolean saveLibrarian(Librarian lib) {
		boolean result = false;
		
		try(var con = MyConnection.getConnection()) {
			
			var insert = "INSERT INTO librarians(id,name,password) VALUES(?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(insert);
			pstm.setInt(1, lib.getId());
			pstm.setString(2, lib.getName());
			pstm.setString(3, lib.getPassword());
			
			pstm.executeUpdate();
			result = true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public static void deleteLibrarianByCode(int id) {
		
		try(var con = MyConnection.getConnection()) {
			
			var delete = "DELETE FROM librarians WHERE id = ?";
			
			PreparedStatement pstm = con.prepareStatement(delete);
			pstm.setInt(1, id);
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void updateLibrarian(Librarian lib) {
		
		try(var con = MyConnection.getConnection()) {
			
			var update = "UPDATE librarians SET name = ? , password = ? WHERE id = ?";
			
			PreparedStatement pstm = con.prepareStatement(update);
			pstm.setString(1, lib.getName());
			pstm.setString(2, lib.getPassword());
			pstm.setInt(3, lib.getId());
			
			pstm.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static List<Librarian> searchLibrarianWihId(String lib) {
		List<Librarian> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			var query = "SELECT * FROM librarians l";
			
			List<Object> params = new ArrayList<>();
			if(!lib.isEmpty()) {
				
				query += " WHERE id LIKE ?";
				params.add("%" + lib + "%"); 
			}	
			
			PreparedStatement pstm = con.prepareStatement(query);

			for(var i = 0; i < params.size(); i++) {
				pstm.setObject(i+1, params.get(i));
			}
			
			var rs = pstm.executeQuery();
			while(rs.next()) {
				
				Librarian librarian = new Librarian();
				librarian.setId(rs.getInt("id"));
				librarian.setName(rs.getString("name"));
				librarian.setPassword(rs.getString("password"));
				
				list.add(librarian);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public static List<Transaction> findAllTransactions() {
		
		List<Transaction> list = new ArrayList<>();
		
		try(var con = MyConnection.getConnection()) {
			
			var query = """
					SELECT t.*,
					m.name 'member',m.card_id 'card_id',m.expired_date 'expired_date',
					b.code 'code', b.title 'book',b.available 'available', 
					l.name 'librarian' ,l.id 'created_by'
					FROM transactions t,members m,books b,librarians l 
					WHERE t.member_id = m.card_id  AND t.book_id = b.code AND t.created_by = l.id
					""";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			var rs = pstm.executeQuery();
			
			while(rs.next()) {
				Transaction trans = new Transaction();
				trans.setId(rs.getInt("id"));
				
				Member m = new Member();
				m.setCard_id(rs.getInt("card_id"));
				m.setName(rs.getString("member"));
				m.setExpired_date(LocalDate.parse(rs.getString("expired_date")));
				trans.setMember_id(m);
				
				Book b = new Book();
				b.setCode(rs.getInt("code"));
				b.setTitle(rs.getString("book"));
				b.setAvailable(rs.getInt("available"));
				trans.setBook_id(b);
				
				
				trans.setBorrow_date(LocalDate.parse(rs.getString("borrow_date")));
				trans.setDue_date(LocalDate.parse(rs.getString("due_date")));
				LocalDate rDate = rs.getString("return_date") == null ? null : LocalDate.parse(rs.getString("return_date"));
				trans.setReturn_date(rDate);
				trans.setFees(rs.getInt("fees"));
				
				Librarian l = new Librarian();
				l.setId(rs.getInt("created_by"));
				l.setName(rs.getString("librarian"));
				trans.setCreated_by(l);
				
				list.add(trans);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public static boolean borrowBook(Transaction tran) {

		try(var con = MyConnection.getConnection()) {
			
			var insert = "INSERT INTO transactions(member_id,book_id,borrow_date,due_date,fees,created_by)"
					+ "VALUES(?,?,?,?,?,?)";
			
			var update = " UPDATE books SET available = ? WHERE code = ?";
			
			PreparedStatement pstm = con.prepareStatement(insert);
			
			pstm.setInt(1, tran.getMember_id().getCard_id());
			pstm.setInt(2, tran.getBook_id().getCode());
			pstm.setDate(3, Date.valueOf(tran.getBorrow_date()));
			pstm.setDate(4, Date.valueOf(tran.getDue_date()));
			pstm.setInt(5, tran.getFees());
			pstm.setInt(6, tran.getCreated_by().getId());
			
			System.out.println(tran.getBook_id().getCode());
			PreparedStatement pstm1 = con.prepareStatement(update);
			pstm1.setInt(1, 1);
			pstm1.setInt(2, tran.getBook_id().getCode());
			pstm.executeUpdate();
			
			pstm1.executeUpdate();

			return true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	public static List<Transaction> findTransactionWithMemberID(int id) {
		
		List<Transaction> list = new ArrayList<>();
		System.out.println(id);
		try(var con = MyConnection.getConnection()) {
			var query = """
					SELECT t.* , 
					m.name 'name' , 
					b.title 'title' , b.code 'code' , b.available 'available'
					FROM transactions t , members m , books b
					WHERE t.member_id = m.card_id AND t.book_id = b.code AND t.member_id = ?
					""";
			
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, id);

			var rs = pstm.executeQuery();
		
			while(rs.next()) {
				Transaction tran = new Transaction();
				tran.setId(rs.getInt("id"));
				
				Member m = new Member();
				m.setName(rs.getString("name"));
				tran.setMember_id(m);
				
				Book b = new Book();
				b.setCode(rs.getInt("code"));
				b.setTitle(rs.getString("title"));
				b.setAvailable(rs.getInt("available"));
				tran.setBook_id(b);

				tran.setBorrow_date(LocalDate.parse(rs.getString("borrow_date")));
				tran.setDue_date(LocalDate.parse(rs.getString("due_date")));
				
				LocalDate rDate = rs.getString("return_date") == null ? null : LocalDate.parse(rs.getString("return_date"));
				tran.setReturn_date(rDate);
				tran.setFees(rs.getInt("fees"));
				
				list.add(tran);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static boolean returnWithBorrowId(Transaction tran) {

		try(var con =MyConnection.getConnection()) {
			
			var insert = "UPDATE transactions t, books b SET t.return_date = ?  WHERE t.book_id = b.code AND  t.id = ?";
			
			var update = "UPDATE books SET available = ? WHERE code = ?";
			
			PreparedStatement pstm = con.prepareStatement(insert);
			pstm.setDate(1, Date.valueOf(tran.getReturn_date()));
			pstm.setInt(2, tran.getId());

			pstm.executeUpdate();
			
			PreparedStatement pstm1 = con.prepareStatement(update);
			pstm1.setInt(1, 0);
			pstm1.setInt(2, tran.getBook_id().getCode());

			pstm1.executeUpdate();

			
			return true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}


}
