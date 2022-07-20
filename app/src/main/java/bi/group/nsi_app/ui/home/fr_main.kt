package bi.group.nsi_app.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import bi.group.nsi_app.adapter.ItemAdapter
import bi.group.nsi_app.data.Datasource
import bi.group.nsi_app.databinding.FragmentHomeBinding
import com.example.android.marsphotos.network.MarsApi

class fr_main : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
                ViewModelProvider(this).get(main_model::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()
        val recyclerView: RecyclerView = binding.recyclerView;
        recyclerView.adapter = ItemAdapter.ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}