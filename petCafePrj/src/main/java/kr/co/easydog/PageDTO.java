package kr.co.easydog;

public class PageDTO {
	
	private int boardCount; // ��ü �� ����
	private int currentPage; // ���� �����ִ� ������
	private int totalPages; // ��ü������ ����
	private int startPage; // ���������� ��ȣ
	private int endPage; // �� ������ ��ȣ
	private static final int NAV_NUM = 10; // �������� 10���� ��ũǥ��(�ϴܿ� �� ��ư�� 10����)
	private static final int BOARD_NUM = 10; // �۵� 10���� ǥ��(DAO�� limit ������ �Բ� �����ؾ���)
	
	// ������ ������ ��� ������ �ڵ����� ���ϵ��� ó��
	public PageDTO(int boardCount, int currentPage) {
		// �� �� ������, ���� ��ȸ���� ������ ������ �Է¹޾� �Ʒ��� �� ��ư�� ����, ���� ������ϴ� ��ȣ�븦 ���մϴ�.
		this.boardCount = boardCount;
		this.currentPage = currentPage;
		
		// ���� ���ٸ�
		if(boardCount == 0) {
			this.totalPages = 0;
			this.startPage = 0;
			this.endPage = 0;
		} else {
			// �Խñ� ������ �̿��� ��ü ������ ������ ���ϱ�
			if(boardCount % BOARD_NUM == 0) {
				totalPages = boardCount / BOARD_NUM;
			} else {
				totalPages = boardCount / BOARD_NUM + 1;
			}
		}
		
		// �ش� �������� ���� ������ ���ϱ�(startPage ���ϱ�)
		startPage = ((currentPage - 1) / NAV_NUM) * NAV_NUM + 1;
		
		endPage = Math.min(startPage + (NAV_NUM -1), totalPages);
		// endPage = (startPage + (NAV_NUM -1) > totalPages) ? totalPages : startPage + (NAV_NUM -1);
		
	} // end Constructor
	
	public int getBoardCount() {
		return boardCount;
	}
	
	// �ؿ� ��ư ���� ���� ���� bool �ڷ���
	public boolean hasNoBoard() {
		return boardCount == 0; // ǥ���� �Խù��� ������ ��ư�� �� �ʿ� ����
	}
	
	public boolean hasBoard() {
		return boardCount > 0; // ǥ���� �Խù��� �ִٸ� ��ư�� ��������
	}
	
	// �������� �� ������ �˷��ִ� getter
	public int getTotalPages() {
		return totalPages;
	}
	
	// �ش� ������ �׷��� ����������
	public int getStartPage() {
		return startPage;
	}
	
	// �ش� ������ �׷��� ��������
	public int getEndPage() {
		return endPage;
	}
	
	public int getcurrentPage() {
		return currentPage;
	}
	
	// ������� ���� toString
	@Override
	public String toString() {
		return "BoardDTO [boardCount=" + boardCount + ", currentPage=" + currentPage + ", totalPages=" + totalPages
				+ ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
}
