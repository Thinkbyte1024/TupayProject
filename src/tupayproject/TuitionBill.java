package tupayproject;

import javax.swing.*;

public class TuitionBill {
	// Method untuk SPP tetap
	public static double TB_Fixed(int generationIndex, int facultyIndex) {
		// Mendapatkan jumlah SPP variabel berdasarkan tipe "Fakultas"
		// TODO: Buat cara untuk memeriksa pilihan angkatan secara efisien.
		switch (facultyIndex) {
			case 0: // Faculty of Business and Humanities
				switch (generationIndex) {
					case 0:
						return 2250000;
					case 1:
						return 2150000;
					case 2:
						return 2050000;
					case 3:
						return 2000000;
					case 4:
						return 1950000;
					case 5:
						return 1850000;
					default:
						System.out.println("Error");
						break;
				}
				break;
			case 1: // Faculty of Science and Technology
				switch (generationIndex) {
					case 0:
						return 1750000;
					case 1:
						return 1800000;
					case 2:
						return 1050000;
					case 3:
						return 1005250;
					case 4:
						return 1000000;
					case 5:
						return 992000;
					default:
						System.out.println("Error");
						break;
				}
				break;
			case 2: // Diploma Program
				switch (generationIndex) {
					case 0:
						return 1450000;
					case 1:
						return 1200000;
					case 2:
						return 1150000;
					case 3:
						return 1000000;
					case 4:
						return 950000;
					case 5:
						return 850000;
					default:
						System.out.println("Error");
						break;
				}
				break;
			default:
				break;
		}
		return 0;
	}

	// Method untuk SPP variabel
	public static double TB_Variable(int generationIndex, int departmentIndex, double total_credits) {
		// TODO: Buat cara untuk memeriksa pilihan angkatan secara efisien.
		switch (departmentIndex) {
			case 0: // Informatics
				switch (generationIndex) {
					case 0:
						return 320000 * total_credits;
					case 1:
						return 280000 * total_credits;
					case 2:
						return 260000 * total_credits;
					case 3:
						return 200000 * total_credits;
					case 4:
						return 180000 * total_credits;
					case 5:
						return 140000 * total_credits;
					default:
						System.out.println("Error");
						break;
				}
				break;
			case 1: // Electrical Engineering
				switch (generationIndex) {
					case 0:
						return 285000 * total_credits;
					case 1:
						return 175000 * total_credits;
					case 2:
						return 165000 * total_credits;
					case 3:
						return 155000 * total_credits;
					case 4:
						return 145000 * total_credits;
					case 5:
						return 135000 * total_credits;
					default:
						System.out.println("Error");
						break;
				}
				break;

			// TODO: Tambahkan case untuk jurusan "Management", "Accounting", "Tourism" dan "Computer Engineering".
			case 2: // Management
				switch (generationIndex) {
					case 0:
						return 285000 * total_credits;
					case 1:
						return 175000 * total_credits;
					case 2:
						return 165000 * total_credits;
					case 3:
						return 155000 * total_credits;
					case 4:
						return 145000 * total_credits;
					case 5:
						return 135000 * total_credits;
					default:
						System.out.println("Error");
						break;
				}
				break;
			case 3: // Accounting
				switch (generationIndex) {
					case 0:
						return 285000 * total_credits;
					case 1:
						return 175000 * total_credits;
					case 2:
						return 165000 * total_credits;
					case 3:
						return 155000 * total_credits;
					case 4:
						return 145000 * total_credits;
					case 5:
						return 135000 * total_credits;
					default:
						System.out.println("Error");
						break;
				}
				break;
			case 4: // Tourism
				switch (generationIndex) {
					case 0:
						return 285000 * total_credits;
					case 1:
						return 175000 * total_credits;
					case 2:
						return 165000 * total_credits;
					case 3:
						return 155000 * total_credits;
					case 4:
						return 145000 * total_credits;
					case 5:
						return 135000 * total_credits;
					default:
						System.out.println("Error");
						break;
				}
				break;
			case 5: // Computer Engineering
				switch (generationIndex) {
					case 0:
						return 285000 * total_credits;
					case 1:
						return 175000 * total_credits;
					case 2:
						return 165000 * total_credits;
					case 3:
						return 155000 * total_credits;
					case 4:
						return 145000 * total_credits;
					case 5:
						return 135000 * total_credits;
					default:
						System.out.println("Error");
						break;
				}
				break;
			default:
				// Tampilkan dialog error jika terdapat kesalahan dalam memilih kolom tersebut.
				JOptionPane.showMessageDialog(null, "An unknown error has occured", "Error", JOptionPane.ERROR_MESSAGE);
				break;
		}
		return 0;
	}

	// Menghitung total SPP
	public static double TB_Total(int generationIndex, int facultyIndex, int departmentIndex, double total_credits) {
		return TB_Fixed(generationIndex, facultyIndex) + TB_Variable(generationIndex, departmentIndex, total_credits);
	}
}
