import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {

        // 문제 1. 영화(MoveVO) 객체를 모델링하고 영화 3편의 객체를 생성하고 출력하는 프로그램을 작성하시오.
        MoveVO movie1 = new MoveVO("영화1", "주인공1", "제작사1", "2023-07-01", 10000, "X");
        MoveVO movie2 = new MoveVO("영화2", "주인공2", "제작사2", "2023-07-02", 12000, "R");
        MoveVO movie3 = new MoveVO("영화3", "주인공3", "제작사3", "2023-07-03", 15000, "PG");

        ArrayList<MoveVO> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        for (MoveVO movie : movies) {
            System.out.println(movie);
        }

        // 문제 2. 1번에서 생성한 데이터를 활용하여 등급을 기준으로 오름차순 정렬하여 출력하시오.
        sortByRatingAscendingAndPrint(movies);
        // 문제 3. 1번에서 생성한 데이터를 활용하여 등급을 기준으로 내림차순 정렬하여 출력하시오.
        sortByRatingDescendingAndPrint(movies);
        // 문제 4. 1번에서 생성한 데이터를 활용하여 가격이 가장 높은 영화 정보를 출력하시오.
        findHighestPriceMovieAndPrint(movies);
        // 문제 5. 영화제목을 입력하면 해당 영화만 검색하여 출력하시오.(이진검색)
        Scanner scanner = new Scanner(System.in);
        System.out.print("영화 제목을 입력하세요: ");
        String searchTitle = scanner.nextLine();
        searchMovieByTitleAndPrint(movies, searchTitle);
    }

    public static void sortByRatingAscendingAndPrint(ArrayList<MoveVO> movies) {
        Collections.sort(movies, new Comparator<MoveVO>() {
            @Override
            public int compare(MoveVO movie1, MoveVO movie2) {
                return movie1.getRating().compareTo(movie2.getRating());
            }
        });

        System.out.println("등급을 기준으로 오름차순으로 정렬된 영화 정보:");
        for (MoveVO movie : movies) {
            System.out.println(movie);
        }
    }

    public static void sortByRatingDescendingAndPrint(ArrayList<MoveVO> movies) {
        Collections.sort(movies, new Comparator<MoveVO>() {
            @Override
            public int compare(MoveVO movie1, MoveVO movie2) {
                return movie2.getRating().compareTo(movie1.getRating());
            }
        });

        System.out.println("등급을 기준으로 내림차순으로 정렬된 영화 정보:");
        for (MoveVO movie : movies) {
            System.out.println(movie);
        }
    }

    public static void findHighestPriceMovieAndPrint(ArrayList<MoveVO> movies) {
        MoveVO highestPriceMovie = Collections.max(movies, new Comparator<MoveVO>() {
            @Override
            public int compare(MoveVO movie1, MoveVO movie2) {
                return movie2.getPrice() - movie1.getPrice();
            }
        });

        System.out.println("\n가격이 가장 높은 영화 정보:");
        System.out.println(highestPriceMovie);
    }

    public static void searchMovieByTitleAndPrint(ArrayList<MoveVO> movies, String title) {
        Collections.sort(movies, new Comparator<MoveVO>() {
            @Override
            public int compare(MoveVO movie1, MoveVO movie2) {
                return movie1.getTitle().compareTo(movie2.getTitle());
            }
        });

        int index = binarySearchByTitle(movies, title);
        if (index != -1) {
            System.out.println("\n영화 제목으로 검색된 영화 정보:");
            System.out.println(movies.get(index));
        } else {
            System.out.println("\n해당 제목의 영화를 찾을 수 없습니다.");
        }
    }

    public static int binarySearchByTitle(ArrayList<MoveVO> movies, String title) {
        int left = 0;
        int right = movies.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = movies.get(mid).getTitle().compareTo(title);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
