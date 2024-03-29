package kr.co.easydog;

public class PageDTO {
	
	private int boardCount; // 전체 글 개수
	private int currentPage; // 현재 보고있는 페이지
	private int totalPages; // 전체페이지 개수
	private int startPage; // 시작페이지 번호
	private int endPage; // 끝 페이지 번호
	private static final int NAV_NUM = 10; // 페이지는 10개씩 링크표시(하단에 깔릴 버튼은 10개씩)
	private static final int BOARD_NUM = 10; // 글도 10개씩 표시(DAO의 limit 구문도 함께 수정해야함)
	
	// 생성자 생성시 모든 정보를 자동으로 구하도록 처리
	public PageDTO(int boardCount, int currentPage) {
		// 총 글 갯수와, 현재 조회중인 페이지 정보를 입력받아 아래에 깔릴 버튼의 개수, 현재 깔려야하는 번호대를 구합니다.
		this.boardCount = boardCount;
		this.currentPage = currentPage;
		
		// 글이 없다면
		if(boardCount == 0) {
			this.totalPages = 0;
			this.startPage = 0;
			this.endPage = 0;
		} else {
			// 게시글 개수를 이용해 전체 페이지 개수를 구하기
			if(boardCount % BOARD_NUM == 0) {
				totalPages = boardCount / BOARD_NUM;
			} else {
				totalPages = boardCount / BOARD_NUM + 1;
			}
		}
		
		// 해당 페이지의 시작 페이지 구하기(startPage 구하기)
		startPage = ((currentPage - 1) / NAV_NUM) * NAV_NUM + 1;
		
		endPage = Math.min(startPage + (NAV_NUM -1), totalPages);
		// endPage = (startPage + (NAV_NUM -1) > totalPages) ? totalPages : startPage + (NAV_NUM -1);
		
	} // end Constructor
	
	public int getBoardCount() {
		return boardCount;
	}
	
	// 밑에 버튼 깔지 말지 결정 bool 자료형
	public boolean hasNoBoard() {
		return boardCount == 0; // 표시할 게시물이 없으면 버튼도 깔 필요 없음
	}
	
	public boolean hasBoard() {
		return boardCount > 0; // 표시할 게시물이 있다면 버튼을 깔아줘야함
	}
	
	// 페이지의 총 개수를 알려주는 getter
	public int getTotalPages() {
		return totalPages;
	}
	
	// 해당 페이지 그룹의 시작페이지
	public int getStartPage() {
		return startPage;
	}
	
	// 해당 페이지 그룹의 끝페이지
	public int getEndPage() {
		return endPage;
	}
	
	public int getcurrentPage() {
		return currentPage;
	}
	
	// 디버깅을 위한 toString
	@Override
	public String toString() {
		return "BoardDTO [boardCount=" + boardCount + ", currentPage=" + currentPage + ", totalPages=" + totalPages
				+ ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
}